package collection.job_state_reasons;

import javax.print.attribute.standard.JobStateReason;

public class JobStateReasonsMain {

	public static void main(String[] args) {

		JobStateReasonsImpl jobStateReasons = new JobStateReasonsImpl();
		
        jobStateReasons.add(JobStateReason.COMPRESSION_ERROR);
        jobStateReasons.add(JobStateReason.JOB_CANCELED_BY_USER);
        jobStateReasons.add(JobStateReason.JOB_COMPLETED_WITH_WARNINGS);
        jobStateReasons.add(JobStateReason.DOCUMENT_FORMAT_ERROR);
 
        System.out.println("the name of category " + jobStateReasons.getName());
        System.out.println();
        
        System.out.println("the jobStateReason are");
        Object[] array = (Object[]) jobStateReasons.toArray();
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println();
 
        jobStateReasons.clear();
        System.out.println("jobStateReasons cleared");
        if (jobStateReasons.isEmpty())
            System.out.println("jobStateReasons is empty");
        else
            System.out.println("jobStateReasons is not empty");
	}

}
