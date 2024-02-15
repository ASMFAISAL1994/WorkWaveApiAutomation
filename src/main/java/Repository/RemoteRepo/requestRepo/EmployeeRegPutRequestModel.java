package Repository.RemoteRepo.requestRepo;

public class EmployeeRegPutRequestModel {

    /**
     * name : morpheus
     * job : zion resident
     */

    private String name;
    private String job;

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob(String job) {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
