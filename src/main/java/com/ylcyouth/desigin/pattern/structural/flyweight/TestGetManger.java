package com.ylcyouth.desigin.pattern.structural.flyweight;

/**
 * @author wjj
 * @create 2019/5/26 13:15
 */
public class TestGetManger {

    /**
     * 公司的部门
     * RD 研发部门
     * QA 测试部门
     * PM 产品部门
     * BD 商务部门
     */
    public static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {

        //公司的10个大boss们随机叫部门经理来做报告
        for (int i = 0; i < 10; i++) {

            //哪个大boss叫哪个部门的经理来做报告
            String department = departments[(int) (Math.random()*departments.length)];
            System.out.println("大boss"+i+"叫"+department+"的经理来做报告");

            //部门经理过来了
            Employee manager = EmployeeFactory.getManager(department);

            //开始做报告
            manager.report();
        }
    }
}
