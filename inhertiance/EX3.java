class UG{
String name , degree , branch , semester , secondary_school_name ;
float GPA , per;
this.name = "Darshan" ; this.degree = "Btech";this.branch = cse ; this.semester = "4 "; this.secondary_school_name = "V&C"; 
this.GPA  = 9.5 ; this.per  = 98.0;
void abc(){
	System.out.println(name+" "+degree+" "+branch+" "+semester+" "+secondary_school_name);
	System.out.println(GPA+" "+per);
}
}
class MS extends UG{
String basic_degree , college_name;
float CGPA ;
this.basic_degree = "Btech " ; this.college_name ="VIT";
CGPA = 9.0; 
void def(){
abc();
	System.out.println(basic_degree+" "+college_name);
	System.out.println(CGPA);
}
}
class PHD extends UG{
String Master_degree , college_name , Area_of_spec ,supervisor_name;
float CGPA ;
Master_degree = "Mtech" ; college_name = "IIT" ; Area_of_spec="Cloud gaming" ; supervisor_name = "l";
CGPA = 9.7;
	void ghi(){
	def();
	System.out.println(Master_degree+" " + college_name +" " + Area_of_spec+" "+ supervisor_name);
	System.out.println(CGPA);
}
}
class EX3 {
public static void main(String args[]){
  PHD  a1 = new PHD();
	a1.ghi();
}

}