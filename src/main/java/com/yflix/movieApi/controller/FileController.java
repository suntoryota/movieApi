package com.yflix.movieApi.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yflix.movieApi.service.FileService;

import jakarta.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/file")
public class FileController {

	private final FileService fileService;

	public FileController(FileService fileService) {
		super();
		this.fileService = fileService;
	}

	@Value("${project.poster}")
	private String path;

	@PostMapping("/upload")
	public ResponseEntity<String> uploadFileHandler(@RequestPart MultipartFile file) throws IOException {
		String uploadedFileName = fileService.uploadfile(path, file);
		return ResponseEntity.ok("File uploaded " + uploadedFileName);
	}

	@GetMapping("/{fileName}")
	public void serveFilehandler(@PathVariable String fileName, HttpServletResponse response)
			throws IOException {
		String decodedFileName = URLDecoder.decode(fileName, StandardCharsets.UTF_8);
		InputStream resourceFile =  fileService.getResourceFile(path, decodedFileName);

		String fileExtension = fileName.substring(decodedFileName.lastIndexOf(".") + 1);
	    String contentType = getContentType(fileExtension);

	    response.setContentType(contentType);
	    StreamUtils.copy(resourceFile, response.getOutputStream());
	}

	private String getContentType(String fileExtension) {
		  switch (fileExtension.toLowerCase()) {
	        case "png":
	            return MediaType.IMAGE_PNG_VALUE;
	        case "jpg":
	        case "jpeg":
	            return MediaType.IMAGE_JPEG_VALUE;
	        case "gif":
	            return MediaType.IMAGE_GIF_VALUE;
	        default:
	            return MediaType.APPLICATION_OCTET_STREAM_VALUE;
	    }
	}
}
