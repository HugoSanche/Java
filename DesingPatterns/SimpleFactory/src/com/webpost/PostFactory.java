package com.webpost;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPost(String post){

         switch (post){
           case  "BlogPost": return new BlogPost();
           case "NewsPost": return new NewsPost();
             case "ProductPost": return new ProductPost();
             default: throw new IllegalArgumentException("Incorrect Post");
        }
    }

}
