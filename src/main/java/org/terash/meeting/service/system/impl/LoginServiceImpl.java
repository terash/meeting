package org.terash.meeting.service.system.impl;

import java.math.BigDecimal;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.terash.meeting.entity.Member;
import org.terash.meeting.service.system.LoginService;

@Stateless
@LocalBean
public class LoginServiceImpl implements LoginService {

	@PersistenceContext(unitName = "meeting")
	private EntityManager em;
	
	public Member findMemberByLoginId(String loginId) {
		return em.find(Member.class, new BigDecimal("1"));
	}
	
	
}
