package edu.fisa.lab.probono.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ProbonoProjectDTO {
	
	private int probonoProjectId;
	private String probonoProjectName;
	private String probonoId;  
	private String activistId;
	private String receiveId;
	private String projectContent;
	

	public ProbonoProjectDTO(String probonoProjectName, String probonoId, String activistId, String receiveId,
			String projectContent) {		
		this.probonoProjectName = probonoProjectName;
		this.probonoId = probonoId;
		this.activistId = activistId;  
		this.receiveId = receiveId;
		this.projectContent = projectContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 프로보노 아이디: ");
		builder.append(probonoProjectId);
		builder.append("2. 프로보노 프로젝트명 : ");
		builder.append(probonoProjectName);
		builder.append("3. 프로보노 정보 : ");
		builder.append(probonoId);
		builder.append("4. 재능 기부자 정보 : ");
		builder.append(activistId);
		builder.append("5. 수해자 정보 : ");
		builder.append(receiveId);
		builder.append("6. 프로젝트 제공내용 : ");
		builder.append(projectContent);
		return builder.toString();
	}
	

}
