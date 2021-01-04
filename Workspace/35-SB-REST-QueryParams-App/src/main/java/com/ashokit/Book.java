package com.ashokit;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Book {

	private String isbn;
	private String bookName;
	private String bookPrice;

}
