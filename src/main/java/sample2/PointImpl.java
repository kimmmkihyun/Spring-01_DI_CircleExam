package sample2;

// �������̽� Ȱ�� : ������ ������쿡  �������� �˷��� �� �ִ�
public class PointImpl implements Point{

	private double xpos; //x��ǥ
	private double ypos; //y��ǥ
	
	
	@Override
	public double getXpos() {
		
		return xpos;
	}

	@Override
	public void setXpos(double xpos) {
		
		this.xpos = xpos;
	}

	@Override
	public double getYpos() {
		
		return ypos;
	}

	@Override
	public void setYpos(double ypos) {
		
		this.ypos = ypos;
	}
	
}