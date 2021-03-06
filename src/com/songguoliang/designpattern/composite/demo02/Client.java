package com.songguoliang.designpattern.composite.demo02;

public class Client {
	public static void main(String[] args) {
		ConcreteCompany root=new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源管理部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany comp=new ConcreteCompany("上海华东分公司");
		comp.add(new HRDepartment("华东分公司人力资源管理部"));
		comp.add(new FinanceDepartment("华东分公司财务部"));
		root.add(comp);
		
		ConcreteCompany comp1=new ConcreteCompany("南京办事处");
		comp1.add(new HRDepartment("南京办事处人力资源管理部"));
		comp1.add(new FinanceDepartment("南京办事处财务部"));
		root.add(comp1);
		
		System.out.println("结构图：");
		root.display(1);
		System.out.println("职责：");
		root.lineOfDuty();
		
	}
}

