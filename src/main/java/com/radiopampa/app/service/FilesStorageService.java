package com.radiopampa.app.service;


import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FilesStorageService {
 	
  public void delete(String file);

  public void carpeta (String path);
	
  public void init(String path);

  public void save(MultipartFile file, String foto);

  public Resource load(String filename);

  public void deleteAll();

  public Stream<Path> loadAll();
  

}
