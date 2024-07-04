//package com.av;
//
//
//import com.av.pojo.Employee;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
///*
//Person (Name, id, address,manager_id)
//Credit (person_id, amount, month_name)
//
//Write a rest end point to get the total credit amount earned by all employees working under
// a particular manager
//In JAN-2025 month
// */
//@RestController
//@RequestMapping("credits")
//public class Test1 {
//    @Autowired
//    private CreditService service;
//
//    @GetMapping("totalCredits/{managerId}")
//    public Map<String, Integer > getEarnedCredits(@QueryParam("managerId") String managerId){
//        return service.getTotalCreditByManager(managerId);
//
//    }
//}
//@Service
//class CreditService {
//
//    @Autowired
//    private CreditRepository repo;
//
//    public Map<String, Integer > getTotalCreditByManager(String managerId){
//        List<ManagerEmployeeDTO> employees = findByAll();
//
//        employees.stream().collect(Collectors.groupingBy(Person::managerId , p -> p.getPersonId().stream().sum(credit -> credit.getAmount())))
//
//
//
//        int totalCredit = 0;
//        for (ManagerEmployeeDTO dto : employees){
//            totalCredit += dto.getAmount();
//        }
//        Map<String , Integer> mgrWithCredits = new HashMap<>();
//        mgrWithCredits.put(managerId, totalCredit);
//        return mgrWithCredits;
//    }
//
//}
//
//@Repository
//interface CreditRepository extends JPARepository<Long , Employee> {
//
//    @NativeQuery("select e.name ,c.amount,e.mangerid from Employee e join Credit c on e.id=c.person_id where p.manager_id :managerId")
//    List<ManagerEmployeeDTO> findByManagerId(String managerId);
//
//}
//
//class ManagerEmployeeDTO {
//     (Name, id, address,manager_id)
//     (person_id, amount, month_name)
//
//
//
//}
