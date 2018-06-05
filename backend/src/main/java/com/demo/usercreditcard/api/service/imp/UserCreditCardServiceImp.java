package com.demo.usercreditcard.api.service.imp;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.usercreditcard.api.converter.UserCreditCardDtoToEntityConverter;
import com.demo.usercreditcard.api.converter.UserCreditCardEntityToDtoConverter;
import com.demo.usercreditcard.api.dto.UserCreditCardDto;
import com.demo.usercreditcard.api.entity.UserCreditCard;
import com.demo.usercreditcard.api.exception.EntityNotFoundException;
import com.demo.usercreditcard.api.repository.UserCreditCardRepository;
import com.demo.usercreditcard.api.service.UserCreditCardService;
import com.demo.usercreditcard.api.validator.UserCreditCardInfoValidator;

@Service
@Transactional
public class UserCreditCardServiceImp implements UserCreditCardService {

	@Autowired
	private UserCreditCardRepository userCreditCardRepository;

	@Autowired
	private UserCreditCardEntityToDtoConverter entityToDtoConverter;

	@Autowired
	private UserCreditCardDtoToEntityConverter dtoToEntityConverter;

	@Autowired
	private UserCreditCardInfoValidator userCreditCardInfoValidator;

	@Override
	public UserCreditCardDto findOne(Long id) {

		UserCreditCard userCreditCard = userCreditCardRepository.findOne(id);

		if (userCreditCard == null)
			throw new EntityNotFoundException("entity.notFound");

		return entityToDtoConverter.convert(userCreditCard);
	}

	@Override
	public UserCreditCard save(UserCreditCardDto entity) {
		userCreditCardInfoValidator.validate(entity);
		return userCreditCardRepository.save(dtoToEntityConverter.convert(entity));
	}

	@Override
	public List<UserCreditCardDto> findCreditCardsByUserID(Long userID) {

		List<UserCreditCard> userCreditCards = userCreditCardRepository.findCreditCardsByUserID(userID
				);

		if (userCreditCards.isEmpty())
			throw new EntityNotFoundException("entity.notFound");

		return userCreditCards.parallelStream().map(entityToDtoConverter::convert).collect(Collectors.toList());
	}

	@Override
	public UserCreditCardDto update(Long id, UserCreditCardDto request) {

		userCreditCardInfoValidator.validate(request);

		UserCreditCard existingEntity = userCreditCardRepository.findOne(id);

		if (existingEntity == null)
			throw new EntityNotFoundException("entity.notFound");

			UserCreditCard newEntity = dtoToEntityConverter.convert(request);

		newEntity.setId(existingEntity.getId());

		return entityToDtoConverter.convert((userCreditCardRepository.save(newEntity)));
	}

	@Override
	public void delete(Long id) {

		UserCreditCard existingEntity = userCreditCardRepository.findOne(id);

		if (existingEntity == null)
			throw new EntityNotFoundException("entity.notFound");

			userCreditCardRepository.delete(id);

	}

	@Override
	public Page<UserCreditCard> findAll(Pageable pageable) {
		return userCreditCardRepository.findAll(pageable);
	}

	@Override
	public List<UserCreditCardDto> findAll() {
		return userCreditCardRepository.findAll().parallelStream().map(entityToDtoConverter::convert)
				.collect(Collectors.toList());
	}

}
