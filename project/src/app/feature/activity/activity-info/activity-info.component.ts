import { Component, Input } from '@angular/core';
import { IActivity } from 'src/app/shared/model/Activity';

@Component({
  selector: 'app-activity-info',
  templateUrl: './activity-info.component.html',
  styleUrls: ['./activity-info.component.scss']
})
export class ActivityInfoComponent {

  @Input() activity:IActivity ={title:'error',image:'error',description:"error",location:"error"};

}
