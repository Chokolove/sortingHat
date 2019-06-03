package edu.cibertec.businessLogic;



import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.jpa.ProfileJPA;
import edu.cibertec.model.ModelAccount;
import edu.cibertec.model.ModelProfile;
import edu.cibertec.util.Util;

public class ProfileBL {
	ModelProfile modelo = new ModelProfile();
	ModelAccount modeloAcc = new ModelAccount();

	public ProfileDTO profileIdLocal(int id) {
		ProfileJPA profile = new ProfileJPA();
		profile = modelo.profileIdAcc(id);

		ProfileDTO prof = new ProfileDTO();
		prof = Util.profileJPAtoDTO(profile);

		return prof;
	}
	public String ingresarProfile(ProfileDTO prof) {

		ProfileJPA profile = new ProfileJPA();

		profile = Util.profileDTOtoJPA(prof);

		modelo.insertarProfile(profile);

		return "Profile registrada Correctamente";
	}
}
