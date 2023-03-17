package ConsTructor_Array_poly;

public class TestShapeP {
	
	public static void main(String [] args) {
		
		ShapeP[] s=new ShapeP[3];
		
		s[0]=new RectangleP(10,20);
		s[1]=new CircleP(10);
		s[2]=new TriangleP(11,20);
		
		RectangleP r=(RectangleP) s[0];
		CircleP C=(CircleP) s[1];
		TriangleP t=(TriangleP) s[2];

		
		for(int i=0; i<s.length; i++) {
			s[i].Area();
		}
		
		
	}

}
