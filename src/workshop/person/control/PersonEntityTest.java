package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonEntityTest {
	public static void main(String[] args) {
		PersonEntity[] persons = new PersonEntity[2];
		//persons[0] 의 타입은?? PersonEntity 타입
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932");
		
	}
}
