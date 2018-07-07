package in.flexsol.productionschedule.delegate;

import java.util.List;

import in.flexsol.productionschedule.dao.LoginDao;
import in.flexsol.productionschedule.modal.Record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	LoginDao loginDao;
	
	@Override
	public List<Record> getRecord() {
		 return loginDao.getRecord();
		
	}

}
