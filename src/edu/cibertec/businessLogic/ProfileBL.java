package edu.cibertec.businessLogic;


import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.jpa.ProfileJPA;
import edu.cibertec.model.ModelAccount;
import edu.cibertec.model.ModelProfile;

public class ProfileBL {
	ModelProfile modelo = new ModelProfile();
	ModelAccount modeloAcc = new ModelAccount();
	
	public ProfileDTO profileIdLocal(int id) {
		ProfileJPA review = new ProfileJPA();
		review = modelo.profileIdAcc(id);
		
		ProfileDTO rev = new ProfileDTO();
		rev.setId(review.getId());
		
		AccountDTO accountDTO = new AccountDTO();
		AccountJPA accountJPA = new AccountJPA();
		
		accountJPA = review.getAccount();
		accountDTO.setId(accountJPA.getId());
		accountDTO.setEmail(accountJPA.getEmail());
		accountDTO.setPassword(accountJPA.getPassword());
		accountDTO.setAccType(accountJPA.getAccType());
		accountDTO.setStatus(accountJPA.getStatus());
		
		rev.setAccount(accountDTO);
		rev.setFullName(review.getFullName());
		rev.setEmail(review.getEmail());
		rev.setPhone1(review.getPhone1());
		rev.setPhone2(review.getPhone2());
		rev.setPhone3(review.getPhone3());
		rev.setDni(review.getDni());
		rev.setCreatedAt(review.getCreatedAt());
		rev.setUpdatedAt(review.getUpdatedAt());
		rev.setStatus(review.getStatus());
		System.out.println("ingresarProfile()");
		System.out.println("Nombre Completo: "+rev.getFullName());
		System.out.println("Email:           "+rev.getEmail());
		System.out.println("Status:          "+rev.getStatus());
		System.out.println("---------------------");
		
		return rev;
	}
	public String ingresarProfile(ProfileDTO prof) {
		System.out.println("ingresarProfile()");
		System.out.println("Nombre Completo : "+prof.getFullName());
		System.out.println("Email: "+prof.getEmail());
		System.out.println("Status: "+prof.getStatus());
		
		
		
		return "Cuenta registrada Correctamente";
	}
}
