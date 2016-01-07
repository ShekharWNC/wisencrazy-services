package com.wisencrazy.restaraunt.datasource.entities.converter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter Class for byte[] to String and vice-versa.
 * 
 * @author Krish Lakshmanan
 * @since 09/09/2014
 */
@Converter
public class ByteArrayStringConverter implements AttributeConverter<String, byte[]> {
	
	private static final Logger logger = LoggerFactory.getLogger(ByteArrayStringConverter.class);

	/**
	 * Compress the UTF-8 encoded String into a byte[]
	 */
	@Override
	public byte[] convertToDatabaseColumn(String uncompressedData) {
		if (uncompressedData == null) {
			return null;
		}
		ByteArrayOutputStream baos = null;
		GZIPOutputStream os = null;
		byte[] compressedBytes = null;
		try {
			baos = new ByteArrayOutputStream();
			os = new GZIPOutputStream(baos);
			os.write(uncompressedData.getBytes("UTF-8"));
			os.finish();
			compressedBytes = baos.toByteArray();
		} catch (Exception e) {
			logger.error("Error at convertToDatabaseColumn - {}", e);
		}

		return compressedBytes;
	}

	/**
	 * Compress the byte[] to UTF-8 encoded String
	 */
	@Override
	public String convertToEntityAttribute(byte[] compressedBytes) {

		if (compressedBytes == null) {
			return null;
		}

		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = null;
		GZIPInputStream is = null;
		String uncompressedData = null;
		try {
			bais = new ByteArrayInputStream(compressedBytes);
			baos = new ByteArrayOutputStream();
			is = new GZIPInputStream(bais);
			int chunkSize = 1024;
			byte[] buffer = new byte[chunkSize];
			int length = 0;
			while ((length = is.read(buffer, 0, chunkSize)) != -1) {
				baos.write(buffer, 0, length);
			}
			uncompressedData = new String(baos.toByteArray(), "UTF-8");
		} catch (Exception e) {
			logger.error("Error at convertToEntityAttribute - {}", e);
		}
		return uncompressedData;
	}

}
