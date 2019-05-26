package edu.cibertec.businessLogic;


import javax.ws.rs.PathParam;

import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.model.ModelProfile;

public class ProfileBL {
	ModelProfile modelo = new ModelProfile();
	public ProfileDTO profileIdLocal(int id) {
		ProfileDTO review = new ProfileDTO();
		review = modelo.profileIdAcc(id);
		return review;
	}
}
