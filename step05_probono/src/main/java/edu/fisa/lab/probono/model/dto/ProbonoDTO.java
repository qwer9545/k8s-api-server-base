package edu.fisa.lab.probono.model.dto;

import edu.fisa.lab.probono.model.entity.Probono;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor  
@AllArgsConstructor 
@Getter
@Setter

public class ProbonoDTO {
	
	private String probonoId;
	private String probonoName;
	private String probonoPurpose;
	
	@Override   
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("프로보노 정보 1. 프로보노 아이디 = ");
		builder.append(probonoId);
		builder.append("2. 프로보노 이름 : ");
		builder.append(probonoName);
		builder.append("3. 프로보노 목적 : ");
		builder.append(probonoPurpose);
		return builder.toString();
	}
	
	public Probono toEntity() {
		return Probono.builder().probonoId(probonoId).probonoName(probonoName).probonoPurpose(probonoPurpose).build();
	}
}
