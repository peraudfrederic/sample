package fitec.service;

import org.springframework.stereotype.Service;

@Service // par d�faut id = nom de la classe avcec minuscule au d�but
public class DaoServiceImpl implements IDaoService {

	@Override
	public double getVersion() {
		
		return version;
	}
	
}
