package edu.cibertec.util;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.jpa.LocalJPA;
import edu.cibertec.jpa.ProfileJPA;
import edu.cibertec.jpa.ReviewJPA;

public class Util {

	public static AccountDTO accJPAtoDTO (AccountJPA jpa) {

		AccountDTO dto = new AccountDTO();

		dto.setId(jpa.getId());
		dto.setEmail(jpa.getEmail());
		dto.setPassword(jpa.getPassword());
		dto.setAccType(jpa.getAccType());
		dto.setStatus(jpa.getStatus());

		System.out.println("ID:     "+jpa.getId());
		System.out.println("Email:  "+jpa.getEmail());
		System.out.println("Pass:   "+jpa.getPassword());
		System.out.println("Type:   "+jpa.getAccType());
		System.out.println("Status: "+jpa.getStatus());
		System.out.println("---------------------");

		return dto;
	}

	public static AccountJPA accDTOtoJPA (AccountDTO dto) {

		AccountJPA jpa = new AccountJPA();

		jpa.setId(dto.getId());
		jpa.setEmail(dto.getEmail());
		jpa.setPassword(dto.getPassword());
		jpa.setAccType(dto.getAccType());
		jpa.setStatus(dto.getStatus());

		System.out.println("Entro en servicio Post - ingresarAccount()");
		System.out.println("Email:  "+jpa.getEmail());
		System.out.println("Pass:   "+jpa.getPassword());
		System.out.println("Type:   "+jpa.getAccType());
		System.out.println("Status: "+jpa.getStatus());
		System.out.println("---------------------");
		return jpa;
	}

	public static LocalDTO localJPAtoDTO (LocalJPA local) {
		LocalDTO loc = new LocalDTO();

		AccountDTO account = new AccountDTO();
		AccountJPA acc = new AccountJPA();
		acc=local.getAdmin();
		account = Util.accJPAtoDTO(acc);

		loc.setId(local.getId());
		loc.setAdmin(account);
		loc.setName(local.getName());
		loc.setAddress(local.getAddress());
		loc.setDescription(local.getDescription());
		loc.setLatitude(local.getLatitude());
		loc.setLongitude(local.getLongitude());
		loc.setCreated_at(local.getCreated_at());
		loc.setUpdated_at(local.getUpdated_at());
		loc.setDeleted_at(local.getDeleted_at());
		loc.setStatus(local.getStatus());

		return loc;
	}
	public static LocalJPA localDTOtoJPA (LocalDTO local) {
		LocalJPA loc = new LocalJPA();

		AccountDTO account = new AccountDTO();
		AccountJPA acc = new AccountJPA();
		account=local.getAdmin();
		acc = Util.accDTOtoJPA(account);

		loc.setId(local.getId());
		loc.setAdmin(acc);
		loc.setName(local.getName());
		loc.setAddress(local.getAddress());
		loc.setDescription(local.getDescription());
		loc.setLatitude(local.getLatitude());
		loc.setLongitude(local.getLongitude());
		loc.setCreated_at(local.getCreated_at());
		loc.setUpdated_at(local.getUpdated_at());
		loc.setDeleted_at(local.getDeleted_at());
		loc.setStatus(local.getStatus());

		return loc;
	}

	public static ProfileDTO profileJPAtoDTO(ProfileJPA jpa) {


		ProfileDTO prof = new ProfileDTO();
		prof.setId(jpa.getId());

		AccountDTO accountDTO = new AccountDTO();
		AccountJPA accountJPA = new AccountJPA();

		accountJPA = jpa.getAccount();
		accountDTO = Util.accJPAtoDTO(accountJPA);

		prof.setAccount(accountDTO);
		prof.setFullName(jpa.getFullName());
		prof.setEmail(jpa.getEmail());
		prof.setPhone1(jpa.getPhone1());
		prof.setPhone2(jpa.getPhone2());
		prof.setPhone3(jpa.getPhone3());
		prof.setDni(jpa.getDni());
		prof.setCreatedAt(jpa.getCreatedAt());
		prof.setUpdatedAt(jpa.getUpdatedAt());
		prof.setStatus(jpa.getStatus());
		System.out.println("ingresarProfile()");
		System.out.println("Nombre Completo: "+prof.getFullName());
		System.out.println("Email:           "+prof.getEmail());
		System.out.println("Status:          "+prof.getStatus());
		System.out.println("---------------------");

		return prof;
	}


	public static ProfileJPA profileDTOtoJPA(ProfileDTO dto) {

		ProfileJPA prof = new ProfileJPA();
		prof.setId(dto.getId());

		AccountDTO accountDTO = new AccountDTO();
		AccountJPA accountJPA = new AccountJPA();

		accountDTO = dto.getAccount();
		accountJPA = Util.accDTOtoJPA(accountDTO);

		prof.setAccount(accountJPA);
		prof.setFullName(dto.getFullName());
		prof.setEmail(dto.getEmail());
		prof.setPhone1(dto.getPhone1());
		prof.setPhone2(dto.getPhone2());
		prof.setPhone3(dto.getPhone3());
		prof.setDni(dto.getDni());
		prof.setCreatedAt(dto.getCreatedAt());
		prof.setUpdatedAt(dto.getUpdatedAt());
		prof.setStatus(dto.getStatus());
		System.out.println("ingresarProfile()");
		System.out.println("Nombre Completo: "+prof.getFullName());
		System.out.println("Email:           "+prof.getEmail());
		System.out.println("Status:          "+prof.getStatus());
		System.out.println("---------------------");

		return prof;
	}

	public static ReviewDTO reviewJPAtoDTO (ReviewJPA jpa) {
		ReviewDTO dto = new ReviewDTO();
		dto.setId(jpa.getId());

		AccountDTO accountDTO = new AccountDTO();
		AccountJPA accountJPA = new AccountJPA();

		accountJPA = jpa.getAccount();
		accountDTO = Util.accJPAtoDTO(accountJPA);

		dto.setAccount(accountDTO);

		LocalJPA local = new LocalJPA();
		LocalDTO loc = new LocalDTO();

		local=jpa.getLocal();
		loc = Util.localJPAtoDTO(local);

		dto.setLocal(loc);
		dto.setStars(jpa.getStars());
		dto.setCommentary(jpa.getCommentary());


		return dto;
	}

	public static ReviewJPA reviewDTOtoJPA (ReviewDTO dto) {
		ReviewJPA jpa = new ReviewJPA();
		jpa.setId(dto.getId());

		AccountDTO accountDTO = new AccountDTO();
		AccountJPA accountJPA = new AccountJPA();

		accountDTO= dto.getAccount();
		accountJPA = Util.accDTOtoJPA(accountDTO);

		jpa.setAccount(accountJPA);

		LocalJPA local = new LocalJPA();
		LocalDTO loc = new LocalDTO();

		loc=dto.getLocal();
		local = Util.localDTOtoJPA(loc);

		jpa.setLocal(local);
		jpa.setStars(dto.getStars());
		jpa.setCommentary(dto.getCommentary());


		return jpa;
	}
}
