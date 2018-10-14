
package uk.co.lewiscook.worldcup2018.github.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Person {

    private Long age;
    @SerializedName("car")
    private String mCar;
    @SerializedName("name")
    private String mName;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getCar() {
        return mCar;
    }

    public void setCar(String car) {
        mCar = car;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
