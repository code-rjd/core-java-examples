import service.ManagerService;

public class ManagerInheritanceDemo {
    public static void main(String[] args) {
        ManagerService managerService = new ManagerService();

        managerService.work();  //parent level from EmployeeService method is accessible

        managerService.manages();//own method is also accessible
        managerService.walks();
        managerService.manages();
    }
}