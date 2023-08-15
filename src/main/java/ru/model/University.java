package ru.model;
import com.google.gson.annotations.SerializedName;
import ru.enums.StudyProfile;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class University extends ModelParent{
    @XmlElement(name = "universityId")
    @SerializedName("universityIdentifier")
    private String id;
    @XmlElement(name = "universityName")
    @SerializedName("universityFullName")
    private String fullName;
    @XmlTransient
    @SerializedName("universityShortName")
    private String shortName;
    @XmlTransient
    @SerializedName("universityYearOfFoundation")
    private int yearOfFoundation;
    @XmlElement(name = "universityProfile")
    @SerializedName("universityProfile")
    private StudyProfile mainProfile;


    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public String toString() {
        return "\n" + "University ID: " + getId() + ", full name of university: " + getFullName() + ", short name of university: " +
                getShortName() + ", year of foundation: " + getYearOfFoundation() + ", main profile of university: " +
                getMainProfile() + "\n";
    }
}
