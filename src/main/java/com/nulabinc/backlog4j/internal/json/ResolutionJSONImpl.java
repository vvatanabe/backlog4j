package com.nulabinc.backlog4j.internal.json;

import com.nulabinc.backlog4j.Issue;
import com.nulabinc.backlog4j.Resolution;
import com.nulabinc.backlog4j.User;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author nulab-inc
 */
public class ResolutionJSONImpl implements Resolution {

    private int id;
    private String name;

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Issue.ResolutionType getResolution() {
        return Issue.ResolutionType.valueOf(this.id);
    }

    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if( obj instanceof Resolution) {
            Resolution other = (Resolution)obj;
            result = new EqualsBuilder().append( id, other.getId() )
                    .isEquals();
        }
        return result;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .toString();
    }
}