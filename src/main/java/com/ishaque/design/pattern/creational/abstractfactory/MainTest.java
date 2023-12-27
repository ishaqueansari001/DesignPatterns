package com.ishaque.design.pattern.creational.abstractfactory;

public class MainTest {

    SocialMediaCreator socialMediaCreator;

    public MainTest(SocialMediaCreator socialMediaCreator){
        this.socialMediaCreator=socialMediaCreator;
    }

    public SocialMedia createSocialMedia(){
        SocialMedia sm= this.socialMediaCreator.createSocialMedia();
        sm.setPost(this.socialMediaCreator.createPostForSocialMedia());
        return sm;
    }

    public static void main(String[] args) {
        MainTest faceBookClient= new MainTest(new FaceBookSocialMediaCreator());
        SocialMedia facebook=faceBookClient.createSocialMedia();
        facebook.startMediaService();

        MainTest linkedInClient= new MainTest(new LinkedInSocialMediaCreator());
        SocialMedia linkedIn=linkedInClient.createSocialMedia();
        linkedIn.startMediaService();
    }



}


interface Post{

    void printPost();

}

class FaceBookPost implements  Post{

    @Override
    public void printPost() {
        System.out.println("writing the FaceBookPost");
    }
}
class LinkedInPost implements  Post{

    @Override
    public void printPost() {
        System.out.println("writing the LinkedInPost");
    }
}

interface SocialMedia {
    void startMediaService();
    void setPost(Post post);
}


class FaceBook implements SocialMedia{
    Post post;

    @Override
    public void startMediaService() {
        System.out.println("Face Book Service is starting");
        post.printPost();
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}


class LnikedIn implements SocialMedia{
    Post post;

    @Override
    public void startMediaService() {
        System.out.println("Linked In Service is starting");
        post.printPost();
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}

interface SocialMediaCreator{
    SocialMedia createSocialMedia();
    Post createPostForSocialMedia();

}

class FaceBookSocialMediaCreator implements  SocialMediaCreator{

    @Override
    public SocialMedia createSocialMedia() {
        SocialMedia sm= new FaceBook();
        return  sm;
    }

    @Override
    public Post createPostForSocialMedia() {
        return  new FaceBookPost();
    }
}

class LinkedInSocialMediaCreator implements  SocialMediaCreator{

    @Override
    public SocialMedia createSocialMedia() {
        SocialMedia sm= new LnikedIn();
        return  sm;
    }

    @Override
    public Post createPostForSocialMedia() {
        return  new LinkedInPost();
    }
}