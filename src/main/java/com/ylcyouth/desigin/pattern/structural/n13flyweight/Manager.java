package com.ylcyouth.desigin.pattern.structural.n13flyweight;

/**
 * @author wjj
 * @create 2019/5/26 12:02
 */
public class Manager implements Employee {

    /**
     * 内部状态
     */
    private String title = "部门经理";

    /**
     * 外部状态
     */
    private String department;

    /**
     * 报告内容, 这个是内部状态还是外部状态啊？ 它应该是受外部状态department影响的
     */
    private String reportContent;

    /**
     * 创建某个部门的部门经理的构造器
     */
    public Manager(String department) {
        this.department = department;
    }

    /**
     * 部门经理对象创建报告的方法
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    /**
     * 员工的作报告的方法（行为）
     */
    @Override
    public void report() {
        System.out.println(reportContent);
        System.out.println();
    }
}
