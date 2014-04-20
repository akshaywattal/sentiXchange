package edu.sjsu.cmpe.bigdata.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import edu.sjsu.cmpe.bigdata.domain.Review;

@JsonPropertyOrder(alphabetic = true)
public class ReviewDto extends LinksDto{
    private Review review;

    public ReviewDto(Review review) {
    	super();
    	this.review = review;
        }
    
    public ReviewDto() {
    	super();
        }

    /**
     * @return the review
     */
    public Review getReview() {
	return review;
    }

    /**
     * @param review
     *            the review to set
     */
    public void setReview(Review review) {
	this.review = review;
    }
}