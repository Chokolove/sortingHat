package edu.cibertec.util;

import org.apache.log4j.Logger;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.entity.Account;
import edu.cibertec.entity.Local;
import edu.cibertec.entity.Profile;
import edu.cibertec.entity.Review;

public class Util {
	
	static final Logger log = Logger.getLogger(Util.class);
	
	public static AccountDTO accJPAtoDTO (Account jpa) {
		log.info("Entrando a accJPAtoDTO()");
		AccountDTO dto = new AccountDTO();

		dto.setId(jpa.getId());
		dto.setEmail(jpa.getEmail());
		dto.setPassword(jpa.getPassword());
		dto.setAccType(jpa.getAccType());
		dto.setStatus(jpa.getStatus());
		
		log.info("ID:     "+jpa.getId());
		log.info("Email:  "+jpa.getEmail());
		log.info("Type:   "+jpa.getAccType());
		log.info("Status: "+jpa.getStatus());
		log.info("---------------------");

		return dto;
	}

	public static Account accDTOtoJPA (AccountDTO dto) {
		log.info("Entrando a accDTOtoJPA()");
		Account jpa = new Account();

		jpa.setId(dto.getId());
		jpa.setEmail(dto.getEmail());
		jpa.setPassword(dto.getPassword());
		jpa.setAccType(dto.getAccType());
		jpa.setStatus(dto.getStatus());
		
		log.info("ID:     "+jpa.getId());
		log.info("Email:  "+jpa.getEmail());
		log.info("Type:   "+jpa.getAccType());
		log.info("Status: "+jpa.getStatus());
		log.info("---------------------");
		return jpa;
	}

	public static LocalDTO localJPAtoDTO (Local local) {
		log.info("Entrando a localJPAtoDTO()");
		LocalDTO loc = new LocalDTO();

		AccountDTO account = new AccountDTO();
		Account acc = new Account();
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
		
		log.info("ID:         "+loc.getId());
		log.info("Admin_id:   "+loc.getAdmin().getId());
		log.info("Admin_email:"+loc.getAdmin().getEmail());
		log.info("Nombre:     "+loc.getName());
		log.info("Direccion:  "+loc.getAddress());
		log.info("Latitud:    "+loc.getLatitude());
		log.info("Longitud:   "+loc.getLongitude());
		log.info("Status:     "+loc.getStatus());

		return loc;
	}
	public static Local localDTOtoJPA (LocalDTO local) {
		log.info("Entrando a localDTOtoJPA()");
		Local loc = new Local();

		AccountDTO account = new AccountDTO();
		Account acc = new Account();
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
		
		log.info("ID:         "+loc.getId());
		log.info("Admin_id:   "+loc.getAdmin().getId());
		log.info("Admin_email:"+loc.getAdmin().getEmail());
		log.info("Nombre:     "+loc.getName());
		log.info("Direccion:  "+loc.getAddress());
		log.info("Latitud:    "+loc.getLatitude());
		log.info("Longitud:   "+loc.getLongitude());
		log.info("Status:     "+loc.getStatus());

		return loc;
	}

	public static ProfileDTO profileJPAtoDTO(Profile jpa) {
		log.info("Entrando a profileJPAtoDTO()");


		ProfileDTO prof = new ProfileDTO();
		prof.setId(jpa.getId());

		AccountDTO accountDTO = new AccountDTO();
		Account accountJPA = new Account();

		accountJPA = jpa.getAccount();
		accountDTO = Util.accJPAtoDTO(accountJPA);

		prof.setAccount(accountDTO);
		prof.setFullName(jpa.getFullName());
		prof.setPhone1(jpa.getPhone1());
		prof.setPhone2(jpa.getPhone2());
		prof.setPhone3(jpa.getPhone3());
		prof.setDni(jpa.getDni());
		prof.setCreatedAt(jpa.getCreatedAt());
		prof.setUpdatedAt(jpa.getUpdatedAt());
		prof.setStatus(jpa.getStatus());
		
		log.info("ID:              "+prof.getId());
		log.info("Accnt_id:        "+prof.getAccount().getId());
		log.info("Accnt_email:     "+prof.getAccount().getEmail());
		log.info("Nombre Completo: "+prof.getFullName());
		log.info("Numero 1:        "+prof.getPhone1());
		log.info("Numero 1:        "+prof.getPhone2());
		log.info("Numero 1:        "+prof.getPhone3());
		log.info("DNI:             "+prof.getDni());
		log.info("Status:          "+prof.getStatus());
		log.info("---------------------");

		return prof;
	}


	public static Profile profileDTOtoJPA(ProfileDTO dto) {
		log.info("Entrando a profileDTOtoJPA()");

		Profile prof = new Profile();
		prof.setId(dto.getId());

		AccountDTO accountDTO = new AccountDTO();
		Account accountJPA = new Account();

		accountDTO = dto.getAccount();
		accountJPA = Util.accDTOtoJPA(accountDTO);

		prof.setAccount(accountJPA);
		prof.setFullName(dto.getFullName());
		prof.setPhone1(dto.getPhone1());
		prof.setPhone2(dto.getPhone2());
		prof.setPhone3(dto.getPhone3());
		prof.setDni(dto.getDni());
		prof.setCreatedAt(dto.getCreatedAt());
		prof.setUpdatedAt(dto.getUpdatedAt());
		prof.setStatus(dto.getStatus());
		
		log.info("ID:              "+prof.getId());
		log.info("Accnt_id:        "+prof.getAccount().getId());
		log.info("Accnt_email:     "+prof.getAccount().getEmail());
		log.info("Nombre Completo: "+prof.getFullName());
		log.info("Numero 1:        "+prof.getPhone1());
		log.info("Numero 1:        "+prof.getPhone2());
		log.info("Numero 1:        "+prof.getPhone3());
		log.info("DNI:             "+prof.getDni());
		log.info("Status:          "+prof.getStatus());
		log.info("---------------------");

		return prof;
	}

	public static ReviewDTO reviewJPAtoDTO (Review jpa) {
		log.info("Entrando a reviewJPAtoDTO()");
		ReviewDTO dto = new ReviewDTO();
		dto.setId(jpa.getId());

		AccountDTO accountDTO = new AccountDTO();
		Account accountJPA = new Account();

		accountJPA = jpa.getAccount();
		accountDTO = Util.accJPAtoDTO(accountJPA);

		dto.setAccount(accountDTO);

		Local local = new Local();
		LocalDTO loc = new LocalDTO();

		local=jpa.getLocal();
		loc = Util.localJPAtoDTO(local);

		dto.setLocal(loc);
		dto.setStars(jpa.getStars());
		dto.setCommentary(jpa.getCommentary());
		
		log.info("Id:              "+dto.getId());
		log.info("Accnt_id:        "+dto.getAccount().getId());
		log.info("Accnt_email:     "+dto.getAccount().getEmail());
		log.info("Local_id:        "+dto.getLocal().getId());
		log.info("Local_nombre:    "+dto.getLocal().getName());
		log.info("Estrelas:        "+dto.getStars());
		log.info("Comentario:      "+dto.getCommentary());

		return dto;
	}

	public static Review reviewDTOtoJPA (ReviewDTO dto) {
		log.info("Entrando a reviewDTOtoJPA()");
		Review jpa = new Review();
		jpa.setId(dto.getId());

		AccountDTO accountDTO = new AccountDTO();
		Account accountJPA = new Account();

		accountDTO= dto.getAccount();
		accountJPA = Util.accDTOtoJPA(accountDTO);

		jpa.setAccount(accountJPA);

		Local local = new Local();
		LocalDTO loc = new LocalDTO();

		loc=dto.getLocal();
		local = Util.localDTOtoJPA(loc);

		jpa.setLocal(local);
		jpa.setStars(dto.getStars());
		jpa.setCommentary(dto.getCommentary());
		
		log.info("Id:              "+jpa.getId());
		log.info("Accnt_id:        "+jpa.getAccount().getId());
		log.info("Accnt_email:     "+jpa.getAccount().getEmail());
		log.info("Local_id:        "+jpa.getLocal().getId());
		log.info("Local_nombre:    "+jpa.getLocal().getName());
		log.info("Estrelas:        "+jpa.getStars());
		log.info("Comentario:      "+jpa.getCommentary());


		return jpa;
	}
}
