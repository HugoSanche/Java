package com.webpost;

//Design patter: Simple Factory:Se dedica a crear objetos. En la clase postFactory en el metodo createPost
public class Client {
	public static void main(String[] args) {
		Post post=PostFactory.createPost("ProductPost");
		System.out.println(post);
	}

}
