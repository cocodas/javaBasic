package collection.job_state_reasons;

import java.util.Collection;

import javax.print.attribute.Attribute;
import javax.print.attribute.standard.JobStateReason;
import javax.print.attribute.standard.JobStateReasons;

public class JobStateReasonsImpl {
	
	private JobStateReasons jobStateReasons;
	 
    public JobStateReasonsImpl()
    {
        jobStateReasons = new JobStateReasons();
    }
 
    public JobStateReasonsImpl(Collection<JobStateReason> collection)
    {
        jobStateReasons = new JobStateReasons(collection);
    }
 
    public JobStateReasonsImpl(int initialCapacity)
    {
        jobStateReasons = new JobStateReasons(initialCapacity);
    }
 
    public JobStateReasonsImpl(int initialCapacity, float loadFactor)
    {
        jobStateReasons = new JobStateReasons(initialCapacity, loadFactor);
    }
 
    public boolean add(JobStateReason o)
    {
        return jobStateReasons.add(o);
    }
 
    public Class<? extends Attribute> getCategory()
    {
        return jobStateReasons.getCategory();
    }
 
    public String getName()
    {
        return jobStateReasons.getName();
    }
 
    public boolean contains(Object obj)
    {
        return jobStateReasons.contains(obj);
    }
 
    public boolean isEmpty()
    {
        return jobStateReasons.isEmpty();
    }
 
    public boolean remove(Object obj)
    {
        return jobStateReasons.remove(obj);
    }
 
    public int size()
    {
        return jobStateReasons.size();
    }
 
    public void clear()
    {
        jobStateReasons.clear();
    }
 
    public Object[] toArray() 
    {
        return jobStateReasons.toArray();
    }

}
