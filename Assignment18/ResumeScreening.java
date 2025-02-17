import java.util.List;

abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract void displayRoleResponsibilities();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void displayRoleResponsibilities() {
        System.out.println("Responsible for developing and maintaining software applications.");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void displayRoleResponsibilities() {
        System.out.println("Responsible for analyzing and interpreting complex data.");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void displayRoleResponsibilities() {
        System.out.println("Responsible for overseeing product development from conception to launch.");
    }
}


class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + jobRole.getRoleName());
        jobRole.displayRoleResponsibilities();
    }
}

public class ResumeScreening {

    public static void processResumes(List<JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            System.out.println("Screening resume for: " + jobRole.getRoleName());
        }
    }

    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = List.of(
            new Resume<>(new SoftwareEngineer()),
            new Resume<>(new DataScientist()),
            new Resume<>(new ProductManager())
        );

        resumes.forEach(resume -> resume.processResume());

        List<JobRole> jobRoles = List.of(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        processResumes(jobRoles);
    }
}
