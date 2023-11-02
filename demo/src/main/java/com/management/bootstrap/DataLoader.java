/*
 * package com.management.bootstrap;
 * 
 * import com.management.model.Employee; import
 * com.management.service.EmployeeService; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class DataLoader implements CommandLineRunner { private
 * final EmployeeService employeeService;
 * 
 * public DataLoader(EmployeeService employeeService) { this.employeeService =
 * employeeService; }
 * 
 * @Override public void run(String... args) { if
 * (employeeService.getAllEmployees().size() == 0) loadData(); }
 * 
 * private void loadData() { Employee mujo = new Employee();
 * mujo.setFirstName("Mujo"); mujo.setLastName("Mujaga");
 * mujo.setEmail("mujo.mujagin@someEmail"); mujo.setAddress("Srebrenik");
 * mujo.setPhoneNumber("327-321-321"); employeeService.save(mujo);
 * 
 * Employee huso = new Employee(); huso.setFirstName("Huso");
 * huso.setLastName("Husnija"); huso.setEmail("huso.husnija@someEmail");
 * huso.setAddress("Tuzla"); huso.setPhoneNumber("327-321-321");
 * employeeService.save(huso);
 * 
 * Employee mehmed = new Employee(); mehmed.setFirstName("Mehmedaga");
 * mehmed.setLastName("Mehmed"); mehmed.setEmail("mehmedaga@someEmail");
 * mehmed.setAddress("Banja Luka"); mehmed.setPhoneNumber("327-321-321");
 * employeeService.save(mehmed); } }
 */