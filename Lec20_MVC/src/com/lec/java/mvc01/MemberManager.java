package com.lec.java.mvc01;

public class MemberManager implements DbQuery {

	public static final int MAX_DATA = 100;
	private MemberModel[] memberList = new MemberModel[MAX_DATA];
	private int count = 0;
	
	
	// singleton
	private static MemberManager inst = null;
	private MemberManager() {}
	public static MemberManager getInstance() {
		if (inst == null) {
			inst = new MemberManager();
		}
		
		return inst;
	} // end getInstance()
	
	
	@Override
	public void insert(String id, String passwd) {
		System.out.println("insert 호출");
		memberList[count] = new MemberModel(id, passwd);
		memberList[count].displayInfo();
		
		count++;
	} // end insert()

	@Override
	public void searchAll() {
		System.out.println("search 호출");
		for (int i = 0; i < count; i++) {
			memberList[i].displayInfo();
		}
		
	} // end searchAll()

	@Override
	public void update(int index, String id, String passwd) {
		System.out.println("update 호출");
		if (index < count) {
			memberList[index].setId(id);
			memberList[index].setPasswd(passwd);
			
			memberList[index].displayInfo();
		} else {
			System.out.println("수정할 데이터가 없습니다!");
		}
		
	} // end update()

} // end class MemberManager

















