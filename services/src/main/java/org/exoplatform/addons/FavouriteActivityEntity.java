package org.exoplatform.addons;


import org.exoplatform.commons.api.persistence.ExoEntity;
import org.exoplatform.social.core.jpa.storage.entity.ActivityEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;

@Entity(name = "FavActivEntity")
@ExoEntity
@Table(name = "FAVOURITE_ACTIVITY")
@NamedQueries({
@NamedQuery(name = "FavActivEntity.getActivityByTitle", query = "SELECT act FROM FavActivEntity act WHERE act.Title = :title")})

public class FavouriteActivityEntity {

    @Id
    @Column(name = "FAVO_ACTIVITY_ID")
    @SequenceGenerator(name = "SEQ_SOC_SPACES_ID", sequenceName = "SEQ_SOC_SPACES_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_SOC_SPACES_ID")
    private Long ID;

    @Column(name = "ACTIVITY_TITLE")
    private String Title;

    @Column(name = "FAVOURITED_DATE")
    private Calendar FavouritedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TARGET_ACTIVITY", nullable = true)
    private ActivityEntity Target;


    public void setTitle(String title) {
        Title = title;
    }

    public void setTarget(ActivityEntity target) {
        Target = target;
    }

    public void setFavouritedDate(Calendar favouritedDate) {
        FavouritedDate = favouritedDate;
    }

    public Long getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }
    public ActivityEntity getTarget() {
        return Target;
    }

    public Calendar getFavouritedDate(String s) {
        return FavouritedDate;
    }

    public FavouriteActivityEntity(String title) {
        Title = title;
    }
    public FavouriteActivityEntity(String title,Calendar C) {
        Title = title;
        FavouritedDate=C;
    }

    public FavouriteActivityEntity() {
    }

    public FavouriteActivityEntity(String title, Calendar favouritedDate, ActivityEntity target) {
        Title = title;
        FavouritedDate = favouritedDate;
        Target = target;
    }
}
