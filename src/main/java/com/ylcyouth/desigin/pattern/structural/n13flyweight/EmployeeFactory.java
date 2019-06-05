package com.ylcyouth.desigin.pattern.structural.n13flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wjj
 * @create 2019/5/26 13:05
 */
public class EmployeeFactory {

    /**
     * 用来存放享元对象的Map，这里使用hashMap
     */
    public static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    /**
     * 获取部门经理享元对象的方法
     * @param department
     * @return
     */
    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            //创建部门经理
            manager = new Manager(department);
            System.out.print("创建部门经理：" + department);

            //部门经理创建报告
            String reportContent = department + "部门汇报：汇报的主要内容是.....";
            manager.setReportContent(reportContent);
            System.out.println(", 创建报告：" + reportContent);

            //创建好部门经理，把它放到hashMap中，成为享元对象
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
