package com.endava.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("123-amigoscode-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}