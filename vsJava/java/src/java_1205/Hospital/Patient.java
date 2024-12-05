package java_1205.Hospital;

public class Patient {
    private String name;
    private String address;
    private String phone;
    private String disease;
    private String time;

    public Patient(String name, String address, String phone, String disease, String time) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.disease = disease;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", disease='" + disease + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
