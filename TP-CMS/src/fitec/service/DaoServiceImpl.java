package fitec.service;

import org.springframework.stereotype.Service;

@Service // par défaut id = nom de la classe avcec minuscule au début
public class DaoServiceImpl implements IDaoService {

	@Override
	public double getVersion() {
		
		return version;
	}
	
}
