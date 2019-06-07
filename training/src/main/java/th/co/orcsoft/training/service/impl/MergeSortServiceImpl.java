package th.co.orcsoft.training.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("MergeSort")
public class MergeSortServiceImpl implements sortService {
	public String sort() {
		return "Merge sort";
	}
}
