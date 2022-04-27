package vttp2022.workshop21.model;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Customer {
    private int id;
    private String company;
    private String lastName;
    private String firstName;
    private String email;
    private String job;
    private String businessPhone;
    private String homePhone;
    private String mobilePhone;
    private String faxNumber;
    private String address;
    private String city;
    private String stateProvince;
    private String zip;
    private String country;
    private String web;
    private String notes;
    private String blob;

    public Customer create(SqlRowSet rs){
        Customer c = new Customer();
        c.setId(rs.getInt("id"));
        c.setLastName(rs.getString("last_name"));
        c.setFirstName(rs.getString("first_name"));
        // c.setEmail(rs.getString("email_address"));
        // c.setJob(rs.getString("job_title"));
        // c.setBusinessPhone(rs.getString("business_phone"));
        // c.setHomePhone(rs.getString("home_phone"));
        // c.setMobilePhone(rs.getString("mobile_phone"));
        // c.setFaxNumber(rs.getString("fax_number"));
        // c.setAddress(rs.getString("address"));
        // c.setCity(rs.getString("city"));
        // c.setStateProvince(rs.getString("state_province"));
        // c.setZip(rs.getString("zip_postal_code"));
        // c.setCountry(rs.getString("country_region"));
        // c.setWeb(rs.getString("web_page"));
        // c.setNotes(rs.getString("notes"));
        // c.setBlob(rs.getString("attachments"));
        return c;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getBusinessPhone() {
        return businessPhone;
    }
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getFaxNumber() {
        return faxNumber;
    }
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStateProvince() {
        return stateProvince;
    }
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getBlob() {
        return blob;
    }
    public void setBlob(String blob) {
        this.blob = blob;
    }


    
    
}
