package com.gt.s.kos.spend.service;
import java.util.List;

import com.gt.s.kos.approvalline.vo.GtApprovalLineVO;
import com.gt.s.kos.spend.vo.GtSpendVO;

public interface GtSpendService {
	
	public int gtSpendInsert(GtSpendVO svo);
	public int gtSpendInsertFile(GtSpendVO svo);
	public List<GtSpendVO> gtSpendSelectAll();
	public List<GtApprovalLineVO> gtSpendAppSelectAll(GtApprovalLineVO avo);
	public List<GtApprovalLineVO> gtSpendRefSelectAll(GtApprovalLineVO avo);
	public List<GtSpendVO> gtSpendSelect(GtSpendVO svo);
}
