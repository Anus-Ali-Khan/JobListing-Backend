package com.anus.Joblisting.model;

//Since we are using  mongodb as our database sdo this model will convert our post data into JSon first then send it to document of mongo db as it accepts JSON format only.

import java.util.Arrays;
import java.util.Objects;

public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;

    public Post(){
    }

    public String getProfile() {
        return profile;
    }

    public String getDesc() {
        return desc;
    }

    public int getExp() {
        return exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return exp == post.exp && Objects.equals(profile, post.profile) && Objects.equals(desc, post.desc) && Objects.deepEquals(techs, post.techs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profile, desc, exp, Arrays.hashCode(techs));
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
