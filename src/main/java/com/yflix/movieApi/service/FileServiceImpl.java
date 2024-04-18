package com.yflix.movieApi.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService{

	@Override
	public String uploadfile(String path, MultipartFile file) throws IOException {
		//get name of the file
		String fileName = file.getOriginalFilename();

		//get the file path
		String filePath = path + File.separator + fileName;

		//create file object
		File directory = new File(path);
	    if (!directory.exists()) {
	        directory.mkdirs();
	    }

		//copy the file upload file to the path
		Files.copy(file.getInputStream(), Paths.get(filePath));

		return fileName;
	}

	@Override
	public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {
		String filePath = path + File.separator + fileName;
		return new FileInputStream(filePath);
	}

}
