package com.wisencrazy.restaraunt.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.wisencrazy.restaraunt.services.RestarauntAdmin;

@Path("/admin")
public class AdminRest {

	private static final String UPLOAD_FILE_SERVER = "/tmp/imports/";
	private static RestarauntAdmin admin = new RestarauntAdmin();

	@Path("/import/")
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response submitOrder(MultipartFormDataInput inputData) {
		// local variables
		MultivaluedMap<String, String> multivaluedMap = null;
		String fileName = null;
		InputStream inputStream = null;
		String uploadFilePath = null;

		try {
			Map<String, List<InputPart>> map = inputData.getFormDataMap();
			List<InputPart> lstInputPart = map.get("uploadedFile");

			for (InputPart inputPart : lstInputPart) {

				// get filename to be uploaded
				multivaluedMap = inputPart.getHeaders();
				fileName = getFileName(multivaluedMap);

				if (null != fileName && !"".equalsIgnoreCase(fileName)) {

					// write & upload file to UPLOAD_FILE_SERVER
					inputStream = inputPart.getBody(InputStream.class, null);
					uploadFilePath = writeToFileServer(inputStream, fileName);

					// close the stream
					inputStream.close();
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// release resources, if any
		}
		return Response.ok("File uploaded successfully at " + uploadFilePath)
				.build();
	}

	private String getFileName(MultivaluedMap<String, String> multivaluedMap) {

		Date date=new Date();
		String fileName=
		return "UnknownFile";
	}

	private String writeToFileServer(InputStream inputStream, String fileName)
			throws IOException {

		OutputStream outputStream = null;
		String qualifiedUploadFilePath = UPLOAD_FILE_SERVER + fileName;

		try {
			outputStream = new FileOutputStream(new File(
					qualifiedUploadFilePath));
			int read = 0;
			byte[] bytes = new byte[1024];
			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			outputStream.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// release resource, if any
			outputStream.close();
		}
		return qualifiedUploadFilePath;
	}
}
