package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED =1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /* Get the default translation of the word.
     * return the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /* Get the Miwok translation of the word.
     * return the miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /* Get the image resource id.
     * return the image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /* Get the audio resource id.
     * return the audio resource id
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /* Return whether or not there is an image for this Word.
     *
     */
    /**@ mImageResourceId is still equal to NO_IMAGE_PROVIDED=-1
     * if there no change in imageResourceId from the first Constructor
     *
     * @ mImageResourceId is not equal to NO_IMAGE_PROVIDED=-1
     * bcos there no change in imageResourceId from the second Constructor
     * */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
