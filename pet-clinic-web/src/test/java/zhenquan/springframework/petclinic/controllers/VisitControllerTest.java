package zhenquan.springframework.petclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import zhenquan.springframework.petclinic.model.Owner;
import zhenquan.springframework.petclinic.model.Pet;
import zhenquan.springframework.petclinic.model.PetType;
import zhenquan.springframework.petclinic.services.PetService;
import zhenquan.springframework.petclinic.services.VisitService;

import java.time.LocalDate;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
public class VisitControllerTest {

    @Mock
    VisitService visitService;

    @Mock
    PetService petService;

    MockMvc mockMvc;

    VisitController controller;

    private static final Long PET_ID = 1L;
    private static final Long OWNER_ID = 1L;

    @BeforeEach
    void setUp() {
        controller = new VisitController(visitService, petService);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        when(petService.findById(anyLong()))
                .thenReturn(
                    Pet.builder()
                        .id(PET_ID)
                        .birthDate(LocalDate.now())
                        .name("Cat")
                        .visits(new HashSet<>())
                        .owner(Owner.builder()
                                .id(OWNER_ID)
                                .lastName("Jo")
                                .firstName("Joe")
                                .build()
                        )
                        .petType(PetType.builder()
                                .name("Cat")
                                .build()
                        )
                        .build()
        );
    }

    @Test
    void initNewVisitForm() throws Exception {

        mockMvc.perform(get("/owners/1/pets/1/visits/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    void testProcessNewVisitForm() throws Exception {
        mockMvc.perform(post("/owners/1/pets/1/visits/new")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("date", "2019-05-01")
                        .param("description", "some description"))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/owners/1"))
                .andExpect(model().attributeExists("pet"))
                .andExpect(model().attributeExists("visit"));

    }
}
