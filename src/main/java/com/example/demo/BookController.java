package com.example.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class BookController {

	 @Autowired
	 BookRepository bookRepo ; 
	 
	 @GetMapping
	 public List<Book> GetallBookRecords(){
		 return bookRepo.findAll() ; 
	 }
	 @GetMapping
	  public Book GetbookByid(@PathVariable(value="bookId")Long bookId  ){
		   return bookRepo.findById(bookId).get() ;	   
	 }
	 @PostMapping
	 public Book Creatbookrecord(@RequestBody  Book bookrecord ) {
		 return bookRepo.save(bookrecord);
	 }
	 
	 @PutMapping
	 public Book  UpdateBookRecord(@RequestBody  Book bookrecord)throws NotFoundException {
		 if(bookrecord == null || bookrecord.getBookId()==null ) {
			 throw new NotFoundException(); 
		 }
		 Optional<Book> optionalbook= bookRepo.findById((Long) bookrecord.getBookId()); 
		   if(!optionalbook.isPresent()) {
             throw new NotFoundException(); 
		   }
		   Book existingBookRecord= optionalbook.get(); 
		     existingBookRecord.setName(bookrecord.getName());
		     existingBookRecord.setRating(bookrecord.getRating());
		     existingBookRecord.setSummary(bookrecord.getSummary());

                  return bookRepo.save(existingBookRecord); 
		    
	 }
	 
	 
	 
}
