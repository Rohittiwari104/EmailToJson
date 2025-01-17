package com.emailbody.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public interface UploadFileService {

    Map<String, Map<String, Object>>parseTextFile(MultipartFile file) throws Exception;


}
