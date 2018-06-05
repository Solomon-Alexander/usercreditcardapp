package com.demo.usercreditcard.api.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.demo.usercreditcard.api.conf.BaseMockitoTest;
import com.demo.usercreditcard.api.converter.UserCreditCardDtoToEntityConverter;
import com.demo.usercreditcard.api.converter.UserCreditCardEntityToDtoConverter;
import com.demo.usercreditcard.api.dto.UserCreditCardDto;
import com.demo.usercreditcard.api.entity.UserCreditCard;
import com.demo.usercreditcard.api.repository.UserCreditCardRepository;
import com.demo.usercreditcard.api.service.imp.UserCreditCardServiceImp;
import com.demo.usercreditcard.api.validator.UserCreditCardInfoValidator;

public class UserCreditCardServiceTest extends BaseMockitoTest {

   @InjectMocks
   private UserCreditCardServiceImp UserCreditCardService;

   @Mock
   public UserCreditCardRepository UserCreditCardRepository;

   @Mock
   private UserCreditCardEntityToDtoConverter entityToDtoConverter;

   @Mock
   private UserCreditCardDtoToEntityConverter dtoToEntityConverter;

   @Mock
   private UserCreditCardInfoValidator UserCreditCardInfoValidator;

   public UserCreditCard entity;

   @Test
   public void sampleTest() {
         assert(true);
   }


/*    @Before
   public void before() {

      entity = new UserCreditCard();
      entity.setApplicationName("Trendyol");
      entity.setName("Time Out");
      entity.setType("Integer");
      entity.setValue("6161");
      entity.setIsActive(true);
   }

   @Test
   public void should_return_one_UserCreditCard() {

      when(UserCreditCardRepository.findOne(1L)).thenReturn(entity);
      when(entityToDtoConverter.convert(entity)).thenReturn(createSampleUserCreditCardLoginformation());

      UserCreditCardDto foundedUserCreditCard = UserCreditCardService.findOne(1L);

      assertThat(foundedUserCreditCard).isNotNull();
      assertThat(foundedUserCreditCard.getApplicationName()).isEqualTo(entity.getApplicationName());
      assertThat(foundedUserCreditCard.getName()).isNotNull();
      assertThat(foundedUserCreditCard.getName()).isEqualTo(entity.getName());
      assertThat(foundedUserCreditCard.getType()).isEqualTo(entity.getType());
      assertThat(foundedUserCreditCard.getValue()).isEqualTo(entity.getValue());
      assertThat(foundedUserCreditCard.getIsActive()).isEqualTo(entity.getIsActive());
   }

   @Test
   public void should_save_UserCreditCard() {

      when(UserCreditCardRepository.save(entity)).thenReturn(entity);
      when(dtoToEntityConverter.convert(any(UserCreditCardDto.class))).thenReturn(entity);

      UserCreditCard foundedUserCreditCard = UserCreditCardService.save(createSampleUserCreditCardLoginformation());

      assertThat(foundedUserCreditCard).isNotNull();
      assertThat(foundedUserCreditCard.getApplicationName()).isEqualTo(entity.getApplicationName());
      assertThat(foundedUserCreditCard.getName()).isNotNull();
      assertThat(foundedUserCreditCard.getName()).isEqualTo(entity.getName());
      assertThat(foundedUserCreditCard.getType()).isEqualTo(entity.getType());
      assertThat(foundedUserCreditCard.getValue()).isEqualTo(entity.getValue());
      assertThat(foundedUserCreditCard.getIsActive()).isEqualTo(entity.getIsActive());
   }

   @Test
   public void should_find_active_application_configration() {

      final String APP_NAME = "Trendyol";

      List<UserCreditCard> mockEntityList = new ArrayList<>();
      mockEntityList.add(createSampleUserCreditCardEntity());

      when(UserCreditCardRepository.findByApplicationNameAndIsActive(APP_NAME, Boolean.TRUE)).thenReturn(mockEntityList);
      when(entityToDtoConverter.convert(any(UserCreditCard.class)))
            .thenReturn(createSampleUserCreditCardLoginformation());

      List<UserCreditCardDto> foundedUserCreditCardList = UserCreditCardService.findActiveApplicationsByName(APP_NAME);

      assertThat(foundedUserCreditCardList).isNotNull();
      assertThat(foundedUserCreditCardList.size()).isEqualTo(1);
      assertThat(foundedUserCreditCardList.get(0).getName()).isEqualTo(entity.getName());
      assertThat(foundedUserCreditCardList.get(0).getType()).isEqualTo(entity.getType());
      assertThat(foundedUserCreditCardList.get(0).getValue()).isEqualTo(entity.getValue());
      assertThat(foundedUserCreditCardList.get(0).getIsActive()).isEqualTo(true);
   }

   @Test
   public void should_find_all_UserCreditCards() {

      UserCreditCard entity_I = createSampleUserCreditCardEntity();
      entity_I.setApplicationName("X");

      UserCreditCard entity_II = createSampleUserCreditCardEntity();
      entity_II.setApplicationName("Y");

      List<UserCreditCard> UserCreditCardList = new ArrayList<>();
      UserCreditCardList.add(entity_I);
      UserCreditCardList.add(entity_II);

      when(UserCreditCardRepository.findAll()).thenReturn(UserCreditCardList);

      List<UserCreditCardDto> returnedList = UserCreditCardService.findAll();
      assertThat(returnedList).isNotNull();
      assertThat(returnedList.size()).isEqualTo(2);

   }

   private final UserCreditCardDto createSampleUserCreditCardLoginformation() {

      UserCreditCardDto request = new UserCreditCardDto();
      request.setApplicationName("Trendyol");
      request.setName("Time Out");
      request.setType("Integer");
      request.setValue("6161");
      request.setIsActive(true);

      return request;
   }

   private final UserCreditCard createSampleUserCreditCardEntity() {

      UserCreditCard entity = new UserCreditCard();
      entity.setApplicationName("Trendyol");
      entity.setName("Time Out");
      entity.setType("Integer");
      entity.setValue("6161");
      entity.setIsActive(true);

      return entity;
   } */
}
